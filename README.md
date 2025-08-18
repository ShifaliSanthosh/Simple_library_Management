Simple Library Management System:

(ZIP file has all the files in order for working)

This is a project implemented on Java on the IntelliJ IDE to replicate a library setup.

Classes & Features:
- Book : Includes a constructor and getter & setter methods for each of the attributes. A toString( method for printing out the details of the book added. 
- eBook: Subclass of Book (Inheritance-based working) and a super method of toString() to extend the previous method and attributes.
- Library: Includes the main methods for adding, removing by ISBN, listing and searching books. actual logic of each method mentioned.
- LibraryManager: Opening sequence for the user to input their options and thus all their values for the attributes which is then redirected to the Library class for further operations. Also one instance creation - singleton principle.
- BookFactory: Done for two variations in eBook and Book redirecting thus making the route easier for use based on parameters. This is also implemented in the addBook() method of LibraryManager class.

Setup:
Download the files, compile and run the LibraryManager class on IntelliJ. Not on Git for cloning the repository as of now.



