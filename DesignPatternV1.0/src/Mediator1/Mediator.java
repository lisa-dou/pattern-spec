/**
 * Generated with MTL UML 2 Java example
 */
package Mediator1 ;

// Start of user code for imports
import java.util.*;
// End of user code
 
/**
 * @author MTL
 */
public abstract class Mediator {
		    /**
		     * the mboxes attribute.
		     */
		    public List<MailBox> mboxes;
		    /**
		     * the colleagues attribute.
		     */
		    public List<Colleague> colleagues;
 

    /**
     *
     * @param coll
     * @param mb

     */

//JML Specifications
//@ requires !Connected(coll,this) && !Sender(coll,mb) && this.mboxes.contains(mb); 
//@ ensures Connected(coll,this) && Sender(coll,mb);

  public  void Connect(Colleague coll,MailBox mb) 
      { this.colleagues.add(coll); 
mb.senders.add(coll); }
	  


    /**
     *
     * @param col
     * @param mb
     * @return

     */

//JML Specifications
 


  public  Boolean Sender(Colleague col,MailBox mb) 
      { return mb.senders.contains(col); }
	  


    /**
     *
     * @param coll
     * @param mb
     * @return

     */

//JML Specifications
//@ requires Connected(coll,this) && Receiver(coll,mb) && this.mboxes.contains(mb); 
//@ ensures !Receiver(coll,mb) && \result==mb.message;

  public  Message GetMS(Colleague coll,MailBox mb) 
      { mb.receivers.remove(coll);
Message tempms=mb.message;
mb.message=null; 
return tempms; }
	  


    /**
     *
     * @param coll
     * @param mb

     */

//JML Specifications
//@ requires Connected(coll,this) && Sender(coll,mb) && this.mboxes.contains(mb); 
//@ ensures !Connected(coll,this) && !Sender(coll,mb) && (\forall MailBox mbvar; mboxes.contains(mbvar)==> !Receiver(coll,mbvar));

  public  void Disconnect(Colleague coll,MailBox mb) 
      { this.colleagues.remove(coll); 
for(Iterator<MailBox> itmb=this.mboxes.iterator(); itmb.hasNext();)
{ MailBox tempmb= itmb.next();
tempmb.receivers.remove(coll);} }
	  


    /**
     *
     * @param col
     * @param mb
     * @return

     */

//JML Specifications
 


  public  Boolean Receiver(Colleague col,MailBox mb) 
      { return mb.receivers.contains(col); }
	  


    /**
     *
     * @param from
     * @param to
     * @param mb
     * @param ms

     */

//JML Specifications
//@ requires Connected(from,this) && (\forall Colleague tovar; to.contains(tovar)==>Connected(tovar,this)) && Sender(from,mb) && this.mboxes.contains(mb); 
//@ ensures (\forall Colleague tovar; to.contains(tovar)==>Receiver(tovar,mb)) && mb.message==ms;

  public  void PutMS(Colleague from,List<Colleague> to,MailBox mb,Message ms) 
      { mb.message=ms; 
for(Iterator<Colleague> itcol=to.iterator(); itcol.hasNext();)
{ Colleague tempcol= itcol.next();
mb.receivers.add(tempcol);}}
	  


    /**
     *
     * @param col
     * @param med
     * @return

     */

//JML Specifications
 


  public  Boolean Connected(Colleague col,Mediator med) 
      { return med.colleagues.contains(col); }
	  

}    
