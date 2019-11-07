package univs.edu.funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Cargo", "CPF", "Salário", "Usuário"};

    public FuncionarioTableModel(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = funcionarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return funcionario.getIdFuncionario();
            case 1:
                return funcionario.getNomeFuncionario();
            case 2:
                return funcionario.getCargo();
            case 3:
                return funcionario.getCpf();
            case 4:
                return funcionario.getSalario();
            case 5:
                return funcionario.getUsuario().getLogin();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];

        }
        return null;
    }

}
