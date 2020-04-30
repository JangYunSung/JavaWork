package Yunsung;

public class Polymorphism  {
	  public static void main(String[] args) {
	    // ����� ��ü ����
	    HolyKnight uther = new HolyKnight("�켭", 180);
	    
	    // ��Ŀ�μ��� ���� ����
	    Tanker t = uther;
	    t.increaseHp();
	    
	    // �����μ��� ���� ����
	    Healer h = uther;
	    h.heal();
	  }
	}

	interface Tanker {
	  public void increaseHp();
	}

	interface Healer {
	  public void heal();
	}

	/* 1. ��Ŀ�� ���� ������ �ο��ϼ���. */
	class HolyKnight  {
	  private String name;
	  private int hp;

	  public HolyKnight(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  /* 2. Tanker�� �޼ҵ带 �������̵��ϼ���. */
	  /* 3. Healer�� �޼ҵ带 �������̵��ϼ���. */
	}