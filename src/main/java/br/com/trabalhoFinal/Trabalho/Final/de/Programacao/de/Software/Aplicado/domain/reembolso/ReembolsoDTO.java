package br.com.trabalhoFinal.Trabalho.Final.de.Programacao.de.Software.Aplicado.domain.reembolso;

import java.time.LocalDate;

public record ReembolsoDTO(Double valor, String motivo , LocalDate dataReembolso,Long funcionario) {
}
