package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Colaborador colaborador = new Colaborador(1234567890, "Lupercio Leopoldo", new Endereco("Rua das flores", 13), "operador de maquina");

        Colaborador colaboradorClone = colaborador.clone();
        colaboradorClone.setCpf(13);
        colaboradorClone.setNome("Aldair Filho");
        colaboradorClone.getEndereco().setNumero(10);

        assertEquals("Colaborador{cpf=1234567890, nome='Lupercio Leopoldo', endereco=Endereco{logradouro='Rua das flores', numero=13}, cargo='operador de maquina'}", colaborador.toString());
        assertEquals("Colaborador{cpf=13, nome='Aldair Filho', endereco=Endereco{logradouro='Rua das flores', numero=10}, cargo='operador de maquina'}", colaboradorClone.toString());
    }
}