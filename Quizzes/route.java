public class route(){
public boolean Path(Graph g, int a, int b){
	Node root;
	Node visit;
	for(i=0; i<g.nodes.length; i++){
		if(g.nodes[i].value == a){
			root = g.nodes[i];
			break;
		}
	}
	Stack s = new Stack();
	s.push(root);
	while(!s.empty()){
		visit = s.pop();
		if(visit==root){
			return true;
			break;
		}
		visit.visited = true;
		for(int i=0; i<s.children.length; i++){
			if(!s.children[i].visited){
				s.push(s.chlidren[i])
			}
		}
	}
	return false;
	
	
}
}