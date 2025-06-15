package com.exemplo.produtoapp.controller;
import com.exemplo.produtoapp.model.Produto;
import com.exemplo.produtoapp.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository repository;
    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", repository.findAll());
        return "lista";
    }
    @GetMapping("/novo")
    public String novoForm(Model model) {
        model.addAttribute("produto", new Produto());
        return "novo";
    }
    @PostMapping
    public String salvar(@ModelAttribute Produto produto) {
        repository.save(produto);
        return "redirect:/produtos";
    }
}
