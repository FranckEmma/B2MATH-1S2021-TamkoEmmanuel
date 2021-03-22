package connectivity;
import static org.junit.Assert.*;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.junit.Test;

public class RigoConnectivityInspectorTest {
	
	/*
	 * isStronglyConnected()
	 */
	@Test
	public void testIsStronglyConnectedOneVertex() {
		SimpleDirectedGraph<Integer, DefaultEdge>  g = new SimpleDirectedGraph<Integer, DefaultEdge>(DefaultEdge.class);
		g.addVertex(123);
		assertTrue(new RigoConnectivityInspector<Integer, DefaultEdge>(g).isStronglyConnected());
	}
}
