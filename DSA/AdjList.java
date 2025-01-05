
public class AdjList {
    singleLinkedlist adjList[];
    int vertices;

    AdjList(int vertices){
        this.vertices=vertices;
        adjList=new singleLinkedlist[vertices];
        for(int i=0;i<vertices;i++){
            adjList[i]=new singleLinkedlist();
        }
    }

    void addEdges(int u, int v){
        adjList[u].addNode(v);
        adjList[v].addNode(u);

    }

    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.print(i +"is connected to ");
            singleLinkedlist.Node current=adjlist[i].head;
            while(current!=null){
                System.out.print(current.data+",");
                current=current.next;
            }
            System.out.println();

        }
    }
    public static void main(String [] args){
        AdjList adj=new AdjList(5);
        adj.addEdges(0, 1);
        adj.addEdges(0, 2);
        adj.addEdges(1, 3);
        adj.addEdges(1, 4);
        adj.addEdges(0, 0);
        adj.addEdges(0, 0);
    }



}
