//Developed by Bodhisatwa Bhattacharya
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 
import java.util.*;
import java.io.*;
import java.awt.MenuBar;
import java.text.*;
class WordEditor implements ActionListener,Runnable
{
  JFrame f;
  JMenuBar mb;
  JMenu file,edit,format,font,size,style;
  JMenuItem nw,save,saveas,open,cut,copy,paste,selectAll,size11,size12,size14,size18,size20,size24,bold,italics,underline,regular,algerian,tnr,ar,calender;
  JMenuItem SegouUI,Baskerville_Old_Face;
  JTextArea area;
  JTextField tf;
  JButton b;
  Thread t=null;  
  int hours=0, minutes=0, seconds=0;  
  String timeString = "";
  String command="";
  Font ft;
  public WordEditor()
  {
      f=new JFrame("Word Editor");
      mb=new JMenuBar();
      //File
      file=new JMenu("File");
      nw=new JMenuItem("New");
      save=new JMenuItem("Save");
      saveas=new JMenuItem("Save As");
      open=new JMenuItem("Open");
      file.add(nw);file.add(save);file.add(saveas);file.add(open);
      mb.add(file);
      save.addActionListener(this);
      saveas.addActionListener(this);
      nw.addActionListener(this);
      open.addActionListener(this);
      //Edit
      edit=new JMenu("Edit");
      cut=new JMenuItem("Cut");
      copy=new JMenuItem("Copy");
      paste=new JMenuItem("Paste");
      selectAll=new JMenuItem("Select All");
      calender=new JMenuItem("Date/Time");
      edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);edit.add(calender);
      mb.add(edit);
      paste.addActionListener(this);
      cut.addActionListener(this);
      copy.addActionListener(this);
      selectAll.addActionListener(this);
      calender.addActionListener(this);
      //Format
      format=new JMenu("Format");
      font=new JMenu("Font");
      style=new JMenu("Style");
      size=new JMenu("Size");
      //size11,fsize12,fsize14,fsize18,fsize20,
      size11=new JMenuItem("11");
      size12=new JMenuItem("12");
      size14=new JMenuItem("14");
      size18=new JMenuItem("18");
      size20=new JMenuItem("20");
      size24=new JMenuItem("24");
      bold=new JMenuItem("Bold");
      italics=new JMenuItem("Italics");
      underline=new JMenuItem("Underline");
      regular=new JMenuItem("Regular");
      tnr=new JMenuItem("Times New Roman");
      algerian=new JMenuItem("Algerian");
      SegouUI=new JMenuItem("Segou UI");
      Baskerville_Old_Face=new JMenuItem("Baskerville Old Face");
      ar=new JMenuItem("Ariel");
      format.add(font);
      format.add(style);
      format.add(size);
      size.add(size11);
      size.add(size12);
      size.add(size14);
      size.add(size18);
      size.add(size20);
      size.add(size24);
      font.add(bold);
      font.add(italics);
      font.add(regular);
      font.add(underline);
      style.add(algerian);
      style.add(tnr);
      style.add(SegouUI);
      style.add(Baskerville_Old_Face);
      style.add(ar);
      mb.add(format);Baskerville_Old_Face.addActionListener(this);
      SegouUI.addActionListener(this);
      algerian.addActionListener(this);
      bold.addActionListener(this);
      tnr.addActionListener(this);
      size11.addActionListener(this);
      size12.addActionListener(this);
      size14.addActionListener(this);
      size18.addActionListener(this);
      size20.addActionListener(this);
      size24.addActionListener(this);
      italics.addActionListener(this);
      underline.addActionListener(this);
      regular.addActionListener(this);
      ar.addActionListener(this);
      //Text Area
      area=new JTextArea("\n");
      area.setBounds(10,10,1000,600);
      //Text Field
      tf=new JTextField("Type the name");
      tf.setBounds(100,650,100,40);
      //Button for date and time
      t = new Thread(this);  
      t.start();  
      b=new JButton();  
      b.setBounds(400,650,100,40);  
      //Scroll Bar
      //JScrollBar sb=new JScrollBar();  
      //sb.setBounds(1150,100,45,400);  
      //f.add(sb); 
      ft=new Font("Ariel", Font.PLAIN, 12);
      area.setFont(ft);
      f.setJMenuBar(mb);
      f.add(area);
      f.setSize(1040,800);
      f.setLayout(null);
      f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) 
  {
      command=(String)e.getActionCommand();
      //File
      if(e.getSource()==saveas)
      {
        f.add(tf);
      }
      if(e.getSource()==save)
      {
       String text=area.getText();
       String name=tf.getText();
       try
       {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter(name); 
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter fout=new PrintWriter(bw);
        fout.println(text);
        fout.close();       
       }
       catch (Exception IOException)
       {
       }
      }
      if(e.getSource()==nw)
      {
          new WordEditor();
      }
      if(e.getSource()==open)
      {
          f.add(tf);
          try
          {
           FileReader fr=new FileReader(tf.getText());
           BufferedReader fin=new BufferedReader(fr);
           String txt="";
           int i;
           while((i=fr.read())!=-1) 
           {
               txt=txt+(char)i;
           }
           area.setText(txt);
          }
          catch(Exception IOException)
          {}
      } 
      if(e.getSource()==cut)    
       area.cut();    
      if(e.getSource()==paste)    
       area.paste();    
      if(e.getSource()==copy)    
       area.copy();    
      if(e.getSource()==selectAll)    
       area.selectAll();  
      if(e.getSource()==calender)
      {
          f.add(b);
          printTime();
      }
      if(e.getSource()==size11)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,11);
            area.setFont(ft);
      }
      if(e.getSource()==size12)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,12);
            area.setFont(ft);
      }
      if(e.getSource()==size14)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,14);
            area.setFont(ft);
      }
      if(e.getSource()==size18)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,18);
            area.setFont(ft);
      }
      if(e.getSource()==size20)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,20);
            area.setFont(ft);
      }
      if(e.getSource()==size24)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,fontStyle,24);
            area.setFont(ft);
      }
      //bold,italics,underline,regular,tnr,ar;
      if(e.getSource()==bold)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font(fontName,Font.BOLD,fontSize);
            area.setFont(ft);
      }
      if(e.getSource()==algerian)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font("Algerian",fontStyle,fontSize);
            area.setFont(ft);
      }
      if(e.getSource()==SegouUI)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font("Segou UI",fontStyle,fontSize);
            area.setFont(ft);
      }
      if(e.getSource()==Baskerville_Old_Face)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font("Baskerville Old Face",fontStyle,fontSize);
            area.setFont(ft);
      }
      if(e.getSource()==ar)
      {
            String fontName=ft.getName();
            String fontFamily=ft.getFamily();
            int fontSize=ft.getSize();
            int fontStyle=ft.getStyle();
            ft=new Font("Ariel",fontStyle,fontSize);
            area.setFont(ft);
      }
  }
  public void run()
  {
      try
       {  
            while (true)
            {  
  
              Calendar cal = Calendar.getInstance();  
              hours = cal.get( Calendar.HOUR_OF_DAY );  
              if ( hours > 12 )
                hours -= 12;  
              minutes = cal.get( Calendar.MINUTE );  
              seconds = cal.get( Calendar.SECOND );  
  
              SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
              Date date = cal.getTime();  
              timeString = formatter.format( date );  
  
              printTime();  
  
              t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
  }
  public void printTime()
  {  
      b.setText(timeString);  
  }  
  public static void main()throws IOException
  {
      new WordEditor();
  }
}
