import java.util.List;
import java.util.ArrayList;
public class AdjMatrix {

    int[][]matrix;
    int vertices;

    AdjMatrix(int vertices){
        this.vertices=vertices;
        matrix=new int[vertices][vertices];

    }

    void addEdgs(int u,int v,int w){
        matrix[u][v]=w;
        matrix[v][u]=w;

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
        AdjMatrix adj=new AdjMatrix(6);
        adj.addEdges(0,1,10);
        adj.addEdges(0,5,100);
        adj.addEdges(0,2,5);
        adj.addEdges(1,2,2);
        adj.addEdges(1,3,5);
        adj.addEdges(2,3,10);
        adj.addEdges(2,4,20);
        adj.addEdges(3,5,2);
        adj.addEdges(4,5,5);
        

    }



}
