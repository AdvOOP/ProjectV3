package b6070236_b6070212_b6074425;

import javax.swing.JTextPane;

class Threds extends Thread{
	
	public static double finance;
	public double pay2;
	private double total, total2 ,total3 , total4;
	String output = "";
	JTextPane textPane2;
	JTextPane textPane3;
	
	public Threds(JTextPane textPane3,JTextPane textPane2) {
			this.textPane3 = textPane3;
			this.textPane2 = textPane2;
		}

	public void calTotal(double finace,double inter,double inter24,double inter36,double inter48) {
		total = finace + inter;
		output = String.format("%.2f\t", total);
		output = "��͹ 12 ��͹  �ʹ����ͧ���¨�ԧ     "+Double.toString(total)+"�ҷ";
		textPane3.setText(output);
		total = finace + inter24;
		output = String.format("%.2f\t", total);
		output = "��͹ 24 ��͹  �ʹ����ͧ���¨�ԧ     "+Double.toString(total)+"�ҷ";
		textPane3.setText(output);
		total = finace + inter36;
		output = String.format("%.2f\t", total);
		output = "��͹ 36 ��͹  �ʹ����ͧ���¨�ԧ   "+Double.toString(total)+"�ҷ";
		textPane3.setText(output);
		total = finace + inter48;
		output = String.format("%.2f\t", total);
		output = "��͹ 48 ��͹   �ʹ����ͧ���¨�ԧ    "+Double.toString(total)+"�ҷ";
		textPane3.setText(output);
		total2 = finace + inter24;
		total3 = finace + inter36;
		total4 = finace + inter48;
		
	}
	
	public void calInstallment() {
		pay2 = total/12;
		output = String.format("%.2f\t", pay2);
		output = "��͹ 12 ��͹  �ʹ����ͧ��͹    "+output+"�ҷ";
		textPane3.setText(output);
		pay2 = total2/24;
		output = String.format("%.2f\t", pay2);
		output = "��͹ 24 ��͹  �ʹ����ͧ��͹    "+output+"�ҷ";
		textPane3.setText(output);
		pay2 = total3/36;
		output = String.format("%.2f\t", pay2);
		output = "��͹ 36 ��͹  �ʹ����ͧ��͹    "+output+"�ҷ";
		textPane3.setText(output);
		pay2 = total4/48;
		output = String.format("%.2f\t", pay2);
		output = "��͹ 48 ��͹  �ʹ����ͧ��͹    "+output+"�ҷ";
		textPane3.setText(output);
	}
}
