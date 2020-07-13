package Prototype.FirstCoding;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Produto> produtoMap = new HashMap<String, Produto>();

    public Registry(){
        loadItem();
    }

    private void loadItem(){
        Revista revista = new Revista();
        revista.setTema("Sem tema");
        revista.setCodigo(000);
        revista.setPaginas(1);
        revista.setPreco(1);
        produtoMap.put("revistaID", revista);

        HQ hq = new HQ();
        hq.setIlustracao("quadrinhos");
        hq.setCodigo(000);
        hq.setPaginas(1);
        hq.setPreco(2);
        produtoMap.put("hqID", hq);
    }

    public Produto copy(String id){
        Produto produto = null;
        try {
            produto = (Produto)(produtoMap.get(id)).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return produto;
    }
}
