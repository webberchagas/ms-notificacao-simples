package br.com.webberchagas.ms_notificacao.controller;

import br.com.webberchagas.ms_notificacao.business.EmailService;
import br.com.webberchagas.ms_notificacao.business.dto.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO request) {
        emailService.enviaEmail(request);
        return  ResponseEntity.noContent().build();
    }
}
