import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.PrintService;


public class HelloWorldPrinter implements Printable {
	@Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        String mText = "SHOP MA;"
                + "Pannampitiya;"
                + "----------------------------;"
                + "09-10-2012 harsha  no: 001 ;"
                + "No  Item  Qty  Price  Amount ;"
                + "----------------------------;"
                + "1 Bread 1 50.00  50.00 ;"
                + "----------------------------;";

        //Prepare the rendering
        String[] bill = mText.split(";");
        int y = 15;
        Font f = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
        graphics.setFont(f);
        for (int i = 0; i < bill.length; i++) {
            graphics.drawString(bill[i], 5, y);
            y = y + 15;
        }

        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }

    public void pp() throws PrinterException {
        PrinterService ps = new PrinterService();
        //get the printer service by printer name
        PrintService pss = ps.getCheckPrintService("Deskjet-1000-J110-series-2");

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintService(pss);
        job.setPrintable(this);

        try {
            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        try {
            hwp.pp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
