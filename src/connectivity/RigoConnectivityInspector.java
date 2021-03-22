package connectivity;

import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;

public class RigoConnectivityInspector<V,E> {
	
	public RigoConnectivityInspector(Graph<V,E> g) {
		// TODO
	}
	
	/**
	 * Tests whether the graph is connected.
	 * 
	 * @return true if the graph is connected, false otherwise.
	 */
	public boolean isConnected() {
		return true; // TODO
	}

	/**
	 * Returns a list of Set s, where each set contains all vertices that are in
	 * the same maximally connected component. All graph vertices occur in
	 * exactly one set. Based on [RIGO p.32]
	 * 
	 * @return A list of Set s, where each set contains all vertices that are in
	 *         the same maximally connected component.
	 */
	public List<Set<V>> connectedSets() {
		return null; // TODO
	}

	/**
	 * Tests whether an directed graph is strongly connected.
	 * 
	 * @param graph
	 *            A simple directed graph
	 * @return true if the graph is strongly connected, false otherwise.
	 */
	public boolean isStronglyConnected() {
		return true; // TODO
	}

	/**
	 * Tests whether an directed graph is weakly connected.
	 * 
	 * @param graph
	 *            A simple directed graph
	 * @return true if the graph is weakly connected, false otherwise.
	 */
	public boolean isWeaklyConnected() {
		return true; // TODO
	}

	/**
	 * Returns a list of Set s, where each set contains all vertices that are in
	 * the same maximally connected component. All graph vertices occur in
	 * exactly one set. Based on [RIGO pp.32-35]
	 * 
	 * @param g
	 *            A simple directed graph
	 * @return A list of Set s, where each set contains all vertices that are in
	 *         the same maximally connected component.
	 */
	public List<Set<V>> stronglyConnectedSets() {
		return null; // TODO
	}

	/**
	 * MAIN
	 */
	
	public static void main(String[] args) {
		// TODO
	}
}
