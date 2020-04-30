package Yunsung;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Date;

//��ȭ ���� ������ ���� ��ü�� TicketReservation �̶�� �̸��� �ڹ� Ŭ������ �����ϰ��� �մϴ�  
//������ ���� ���Ӽ��� �� ���� Ŭ������ �����ϰ�,
//�⺻�����ڿ� �Ű������� �޴� �����ڿ� getter & setter �� ������� Ŭ������ �ۼ��ϼ���
//������� ��
//��ü�� �Ӽ�
//uid
//���� ������ ���̵� ������ ����Ÿ��
//movieId
//���� ��ȭ id ��, ����Ÿ��
//seatId
//�¼� id ��,  ����Ÿ��
//regDate
//������, ��¥(Date) Ÿ��


import java.util.Date;
public class Main {

	public static void parse(String str) {

		try {

			float f = Float.parseFloat(str);
			f = 0;
			System.out.println(f);

		} catch (NumberFormatException nfe) {
		} finally {
		}

	}

	public static void main(String[] args) {

		parse("invalid");

	}
}
