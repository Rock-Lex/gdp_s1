public class BaumOperationen{
	public static void main(String[] args){
		// Baum aufbauen: Definition beginnt bei den Blättern
//		Node k34 = new Node(20, null, null);
//		Node k33 = new Node(37, null, null);
//		Node k32 = new Node(18, null, null);
//		Node k31 = new Node(127, null, null);
//		Node k21 = new Node(395, k34, k33);
//		Node k22 = new Node(20, k32, k31);
//		Node k11 = new Node(37, k21, k22);


//		Node k32 = new Node(18, null, null);
//		Node k34 = new Node(20, k32, null);
//		Node k21 = new Node(395, null, null);
//		Node k31 = new Node(127, null, k21);
//		Node k11 = new Node(37, k34, k31);


		NodeB k31 = new NodeB(17, null, null);
		NodeB k32 = new NodeB(20, null, null);
		NodeB k33 = new NodeB(50, null, null);
		NodeB k34 = new NodeB(395, null, null);
		NodeB k21 = new NodeB(18, k31, k32);
		NodeB k22 = new NodeB(127, k33, k34);
		NodeB k11 = new NodeB(37, k21, k22);


		System.out.println("Maximum im Baum ist: "+maxSuche(k11));
		System.out.println("Minimum im Baum ist: "+minSuche(k11));
	}
	
	static int maxSuche(NodeB root)
	{
		int max = 0;
		while(root.right != null)
		{
			max = root.right.key;
			root = root.right;
		}
		return max;
	}

	static int minSuche(NodeB root)
	{
		int min = 0;
		while(root.left != null)
		{
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
}
	
class NodeB{
	int key;
	NodeB left;
	NodeB right;

	// Der Konstruktor erleichtert das Erschaffen von Knoten mit sofort zugewiesenem 
	// Schlüssel, sowie Kindknoten.
	public NodeB(int key, NodeB left, NodeB right)
	{
		this.key = key;
		this.left = left;
		this.right = right;
	}
};