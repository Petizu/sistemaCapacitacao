package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");

        isabela.calcularSalarioHorasExtras(10, 5.60);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.println("salario: "+isabela.calcularSalarioTotal(2000));
        System.out.printf("horas extras : R$"+ isabela.getHorasExtras());
        isabela.calcularNumeros(1,2);
    }
}
