

public class Merge_sort {

    void merge(int a[],int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] L= new int[n1+1];
        int[] R= new int[n2+1];
        for(int i=0;i<n1;i++){
            L[i]=a[p+i];

        }
        for(int j=0;j<n2;j++){
            R[j]= a[q+j];
        }
        L[n1]= 2147483647;
        R[n2]= 2147483647;
        int i=0;
        int j=0;
        for(int k=p;k<r;k++){
            if (L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]= R[j];
                j++;
            }
        }

    }
    void merge_sort(int a[],int p,int r){
        if(p<r){
            int q=(p+r)/2;
            merge_sort(a,p,q);
            merge_sort(a,q+1,r);
            merge(a,p,q,r);
        }

    }
    void print_Array(int a[]){
        int n;
        n = a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);

        }
    }


    public static void main(String[] args) {
        int[] arr= {7,13,9,4,1,6,8};
        Merge_sort m= new Merge_sort();
        m.merge_sort(arr, 0, arr.length-1);
        m.print_Array(arr);
    }

}
