package com.books.management;

public class eBook extends Book
{
    private int filesize;
    public eBook(String title, String author, String isbn, boolean available, int filesize) {
        super(title, author, isbn, available);
        this.filesize = filesize;
    }

    //getter method uses the datatype
    public int getFileSize() {
        return filesize;
    }

    //setter method uses the void
    public void setFileSize(int filesize)
    {
        this.filesize = filesize;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", File Size: " + filesize + "KB";
    }
}
