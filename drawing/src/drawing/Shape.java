package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

enum ElementType { NOTSET, SQUARE, RECTANGLE, CIRCLE, ELLIPSE, TRIANGLE, TEXT };
public abstract class Shape {
	 
	ElementType Type;//ͼԪ����
	int OrgX;//ԭ������
	int OrgY;
	Color   BorderColor;//�߽���ɫ
	int BorderType;//�߽�����--ʵ�ߡ����ߡ�����ߵ�
	int BorderWidth;//�߽����
	Color  FillColor;//�����ɫ
	int FillType;//�������--ʵ�ġ�˫�Խǡ�ʮ�ֽ����
	abstract void Draw(Graphics c);//����ͼԪ
	abstract boolean IsMatched(int pnt);//�жϵ��Ƿ�����ͼ���ڲ�    
	abstract void Serialize(Object ar);//���л�
	abstract void SetValue(ElementType t,int x,int y,int width,int height);//�������ݳ�Ա
	abstract void GetValue(ElementType t,int x,int y,int width,int height);//��ȡ���ݳ�Ա��ֵ
	void CShape()
	{
		Type = drawing.ElementType.NOTSET;
		OrgX = 0;
		OrgY = 0;
		SetPen (Color.black, BasicStroke.CAP_BUTT, 2);
		SetBrush(Color.blue, BasicStroke.CAP_BUTT);
	}
	void SetPen(Color bcolor,int btype,int bwidth) {
		BorderColor=bcolor;BorderType=btype;BorderWidth=bwidth;
	}
	void GetPen(Color bcolor,int btype,int bwidth) {
		bcolor=BorderColor;btype=BorderType;bwidth=BorderWidth;
	}
	void SetBrush(Color fcolor,int ftype) {
		FillColor=fcolor; 
		FillType=ftype;
	}
	void GetBrush(Color fcolor,int ftype) {
		fcolor=FillColor; 
		ftype=FillType;
	}
}