package com.tarena.shoot;
/** �ӵ�: �Ƿ����� */
public class Bullet extends FlyingObject {
	private int speed = 10; //�ӵ��߲��Ĳ���
	/** ���췽��  x/y��������Ϊ�ӵ����������Ӣ�ۻ��� */
	public Bullet(int x,int y){
		image = ShootGame.bullet; //ͼƬ
		width = image.getWidth(); //��
		height = image.getHeight(); //��
		this.x = x; //x����:����Ӣ�ۻ���
		this.y = y; //y����:����Ӣ�ۻ���
	}
	
	/** ��дstep() */
	public void step(){
		y -= speed; //y��(����)
	}

	/** ��дoutOfBounds() */
	public boolean outOfBounds(){
		return this.y<-this.height; //�ӵ���yС�ڸ����ӵ��ĸߣ���ΪԽ��
	}
}