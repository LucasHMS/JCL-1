/**
 * 
 */
package interfaces.kernel;

import java.io.Serializable;

/**
 * @author Joubert
 * @version 1.0
 * 
 * enables any type of messages in JCL
 */
public interface JCL_message extends Serializable,Constant{
	
	/**
	 * Returns the type of the message.
	 * @return The type of the message.
	 */
	public abstract int getType();
	
	/**
	 * Sets the type of the message.
	 * @param type - Type to be set in the message.
	 */
	public abstract void setType(int type);
	
	/**
	 * Get the Msg type of the class.
	 * @return message type
	 */
	public abstract int getMsgType();
}