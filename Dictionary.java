
public class Dictionary {
	

    static WordNode root;
	
	int wordCount = 0;
	
	
	
	
	public static boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}
		
	public int getSize(){
		
		return this.wordCount;
	}
		
	public void insert(String word){

		WordNode CurrentNode = root;
		WordNode parent = root;
		
		if(wordCount == 0)
			root = new WordNode(word);
		
		int freq = this.find(word);
		
		///New Word Added
		///ALL insert function goes here
		if(freq == 0)
		{
			this.wordCount++;
			
			while (CurrentNode != null)
			{
				
				if(word.compareTo(CurrentNode.word) == 0)
				{
					CurrentNode.frequency++;
				}
			
				if(word.compareTo(CurrentNode.word) < 0)
				{
					parent = CurrentNode;
					CurrentNode = CurrentNode.getLeft();
				}
				
			    if (word.compareTo(CurrentNode.word) > 0)
				{
			    	parent = CurrentNode;
			    	CurrentNode = CurrentNode.getRight();
				}
			}
			
			WordNode newNode = new WordNode(word);

			
	        if(CurrentNode == null)
	        {
	        	parent.setLeftChild(newNode);
	        	//CurrentNode.setLeftChild(newNode);
	        }
	        else if (word.compareTo(CurrentNode.word) < 0)
	        {
	        	parent.setLeftChild(newNode);
	        	//CurrentNode.setLeftChild(newNode);
	        }
	        else
	        {
	        	parent.setRightChild(newNode);
	        	//CurrentNode.setRightChild(newNode);
	        }
		}

	}	
			
	
	
	///Returns the frequency of the word if found
	///else returns -1
	public int find(String word){
		
		WordNode CurrentNode = root;
		
		while (CurrentNode != null)
		{
			if(word.compareTo(CurrentNode.word) == 0)
			{
				return CurrentNode.frequency;
			}
		
			if(word.compareTo(CurrentNode.word) < 0)
			{
				CurrentNode = CurrentNode.getLeft();
			}
			
		    if (word.compareTo(CurrentNode.word) > 0)
			{
		    	CurrentNode = CurrentNode.getRight();
			}
		}	
		
		return -1;
	}
	
	public void printSorted(){	
	
	}
	
	public void remove(String word)
	{
		//find(word).WordNode.height = -1;
	}
	
}
