import atividade.Atividade;
import atividade.CarregarVideo;

import java.util.ArrayList;

public class Workflow {
    ArrayList<Atividade> atividade = new ArrayList<>();
    public  void registrarAtividade(Atividade atividade){
            this.atividade.add(atividade);
    }

}
