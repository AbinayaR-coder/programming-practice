#include<iostream>
using namespace std;
class Stack{
    int *array;
    int top , size;
    public:
    Stack(int n){
        top = -1;
        size = n;
        array = new int[size];
    }
    void init(){
        for(int i = 0 ; i < size ; i++){
            array[i] = 0;
        }
    }
    void push(int value){
        if(top == size - 1){
            cout<<"Overflow"<<endl;
        }
        else{
            top++;
            array[top] = value;
        }
    }
    int pop(){
        if(top == -1){
            cout<<"Underflow"<<endl;
            return -1;
        }
        else{
            int a = array[top];
            array[top] = 0;
            top--;
            return a;
        }
    }
    int peek(){
        if(top == -1){
            cout<<"The stack is empty ";
            return -1;
        }
        else{
            return array[top];
        }
    }
    bool isEmpty(){
        return (top == -1);
    }
    int count(){
        return top+1;
    }
    ~Stack(){
        delete []array; 
    }
};
int main(){
    int size,n,value;
    cout<<"Enter the size of stack :";
    cin>>size;
    Stack s(size);
    s.init();
    cout<<"Enter the number of elements :";
    cin>>n;
    cout<<"Enter values...\n";
    for(int i = 0 ; i < n ; i++){
        cout<<"Enter "<< i <<" element :";
        cin>>value;
        s.push(value); 
    }
    cout<<"Top element :";
    cout<<s.peek()<<endl;
    cout<<"Popped element :";
    cout<<s.pop()<<endl;
    cout<<"Top element after pop :";
    cout<<s.peek()<<endl;
    if(s.isEmpty()){
        cout<<"True"<<endl;
    }
    else{
        cout<<"False"<<endl;
    }
    cout<<"The number of elements in the Stack : ";
    cout<<s.count();
    return 0;
}
