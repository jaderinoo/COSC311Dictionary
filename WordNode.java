
public class WordNode {
	public String word;
	public int height;
	public int frequency;
	
	WordNode left;
	WordNode right;

	public WordNode(String Word) {
		this.word = Word;
		height = 1;
		
		this.left = null;
		this.right = null;
	}
	
	public WordNode getLeft()
	{
		return this.left;
	}
	
	public WordNode getRight()
	{
		return this.right;
	}
	
	public int getHeight()
	{
		return this.height;
	}

	public void setRightChild(WordNode rightChild) {
		this.right = rightChild;
		height++;
	}
	
	public void setLeftChild(WordNode leftChild) {
		this.left = leftChild;
		height++;
	}
}
