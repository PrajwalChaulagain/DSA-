import java.util.List;
import java.util.ArrayList;
public class AdjMatrix {

    int[][]matrix;
    int vertices;

    AdjMatrix(int vertices){
        this.vertices=vertices;
        matrix=new int[vertices][vertices];

    }

    void addEdgs(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1;

    }

    void printGraph(){
        for(int i=0;i<vertices;i++){
            //row
            System.out.print(i+"is connected to");
            for(int j=0;j<vertices;j++){
                //column
                if(matrix[i][j]!=0){
                    //i,j are connected
                    System.out.print(j+",");
                }
            }
            System.out.println();

        }

    }

    List<Integer> getAdjNodes(int i){
    List<Integer> adjNodes=new ArrayList<>();
            for(int j=0;j<vertices;j++){
                //column
                if(matrix[i][j]!=0){
                    //i,j are connected
                    adjNodes.add(j);
                }
            }

        return adjNodes;

    }    
    public static void main(String[] args){
        AdjMatrix adj=new AdjMatrix(5);
        adj.addEdgs(0, 1);
        adj.addEdgs(0, 2);
        adj.addEdgs(0, 0);

    }



}
