package hw1;

/**
 * 
 * @author Cole Dustin This is a simple printer program that replicates a paper
 *         printer
 *
 */
public class Printer {

	// Class variables

	/**
	 * Number of sheets in the tray whether or not its in the printer
	 */
	private int sheets;

	/**
	 * Sheets available to the printer at the moment the method is called
	 */
	private int sheetsAvailable;

	/**
	 * Total number of paper a printers tray can hold
	 */
	private int trayCapacity;

	/**
	 * The total number of pages the document to be printed has
	 */
	private int documentPages;

	/**
	 * The next page to be printed
	 */
	private int nextPage;

	/**
	 * The total number of pages a this printer has printed
	 */
	private int totalPages;

	// Class constructor

	/**
	 * This is a the only constructor for the printer and it takes a parameter for
	 * the amount of paper that can fit in this printers tray
	 * 
	 * @param trayCapacity
	 */
	public Printer(int trayCapacity) {
		
		this.trayCapacity = trayCapacity;

	}

	// Class methods

	/**
	 * This method decides the size of the document and sets the document's next
	 * page to 0.
	 * 
	 * Note: The documents page number start at 0, NOT 1
	 * 
	 * @param documentPages
	 */
	public void startPrintJob(int documentPages) {
		
		this.documentPages = documentPages;
		
		//Sets the next page to 0 when a new document is to be printed
		nextPage = 0;
	}

	/**
	 * Returns the number of the next page to be printed
	 * 
	 * Note: If this is a new document it will return 0
	 * 
	 * @return
	 */
	public int getNextPage() {

		return nextPage;
	}

	/**
	 * Returns the total number of pages the printer has printed
	 * 
	 * @return
	 */
	public int getTotalPages() {

		return totalPages;
	}

	/**
	 * Returns how many pages are available to be printed
	 * 
	 * Note: if there is no tray it will return a 0
	 * 
	 * @return
	 */
	public int getSheetsAvailable() {
		
		return sheetsAvailable;
	}

	/**
	 * Removes the tray from the printer
	 */
	public void removeTray() {
		
		//Makes 0 sheets available to the printer
		sheetsAvailable = 0;
	}

	/**
	 * Puts the tray back in the printer
	 */
	public void replaceTray() {
		
		//Makes all of the sheets in the tray available to the printer
		sheetsAvailable = sheets;
	}

	/**
	 * Prints a piece of paper and iterates the page number and total pages printed,
	 * but only if paper is available. It also decreases the amount of paper in the
	 * tray and paper available to the printer.
	 */
	public void printPage() {

		// Adds to the total page count if and only if there are sheets available
		totalPages = totalPages + Math.min(sheetsAvailable, 1);

		// Adds to the next page number if and only if there are sheets available. It
		// then loops back to 0 after one full document has been printed
		nextPage = (nextPage + Math.min(sheetsAvailable, 1)) % documentPages;

		// Decreases the number of sheets in the tray by 1 but will not go negative
		sheets = sheets - Math.min(sheetsAvailable, 1);

		// Decreases the amount of sheets available by 1 but will not go negative
		sheetsAvailable = Math.max(sheetsAvailable - 1, 0);
	}

	/**
	 * Removes the tray to add 'n' number sheets of paper to the tray. Then puts the
	 * tray back into the printer
	 * 
	 * @param n
	 */
	public void addPaper(int n) {

		// Adds n number of sheets to the tray but will not go over the tray capacity
		sheets = Math.min(sheets + n, trayCapacity);

		// Sets the number of sheets available to the number of sheets in the tray. This
		//is used as a redundancy variable to tell the printer when the tray is in the printer
		sheetsAvailable = sheets;
	}

	/**
	 * Removes the tray to remove 'n' number sheets of paper to the tray. Then puts
	 * the tray back into the printer
	 * 
	 * @param n
	 */
	public void removePaper(int n) {
		
		// Removes n number of sheets to the tray but will not go over the tray capacity
		sheets = Math.max(sheets - n, 0);
		
		// Sets the number of sheets available to the number of sheets in the tray. This
		//is used as a redundancy variable to tell the printer when the tray is in the printer
		sheetsAvailable = sheets;
	}
}