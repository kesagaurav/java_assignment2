
public class Button {
private String title;
private onClickListener onclicklistener;
public Button(String title) {
	super();
	this.title=title;
}

public String getTitle() {
	return title;
}


public void setOnClickListener(onClickListener onclicklistener) {
	this.onclicklistener=onclicklistener;
}

public void onClick() {
	this.onclicklistener.onClick(this.title);
}


public interface onClickListener{
	public void onClick(String title);
}




}
