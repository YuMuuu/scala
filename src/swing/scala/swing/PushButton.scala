package scala.swing

import javax.swing._
import event._

/** A class for buttons; standard constructor wraps around a swing button */
class PushButton(override val peer: JButton) extends Component with Publisher {
  def this(txt: String) = this(new JButton(txt))
  def this() = this(new JButton)
  def text: String = peer.getText
  def text_=(s: String) = peer.setText(s)
  def icon: Icon = peer.getIcon
  def icon_=(i: Icon) = peer.setIcon(i)

}
