/*
������ �����͸� ��Ƽ� �����Ҷ��� �ݵ�� ������ ��Ե�
�������� �뷮�� ǥ���ؾ� �ϴµ�, �� �뷮ǥ�ø� �ڷ����̶�
�Ѵ�.
�����ϱ�� ������, �����ڰ� �޸� �뷮�� �������� �� �ִ�!!

1.���� : char (2byte)=16bit   2�� 16�°���
2.���� : byte(1byte)=8bit 
			<short(2byte)16bit
			<int(4byte)  32bit
			< long(8byte) 64bit
3.���� : boolean (1byte)
mm (�ּ�)  -----   cm 
g    (�ּ�) -------  kg

bit   (�ּ�) ------- byte
*/
class  DataType{
	public static void main(String[] args){
		//���� �ڷ��� !! (�ɸ�����)
		char c='��'; //���ڿ��� �ƴ� �ϳ��� ���ڴ� Ȭ����ǥ

		//2byte ¥�� �����Ͱ� �� 4�� Ȯ�� = 8byte
		char[] arr=new char[4];
		arr[0]='��';
		arr[1]='��';
		arr[2]='��';
		arr[3]='��';

		char[] arr2={'��','��','��','ī'};

		for(int i=0;i<arr.length;i++){
			//System.out.print("c�� ���� "+arr[i]);
			//System.out.print("c�� ���� "+arr2[i]);
		}
		
		byte a=77;
		long k=3434;

		//a+k;
		boolean m=true;

		//
		byte t=128;
	}
}
