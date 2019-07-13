let promise = new Promise((res,rej)=>{
const items = [{id:1,name:'Nistha'},{id:2,name:'Shreya'}];
if(items.length>0){
    res(items);
}else{
    rej("rejected");
}
});
let promise1 = new Promise((res,rej)=>{
    const items = [{id:1,name:'Nistha'},{id:2,name:'Shreya'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
    });
    let promise2 = new Promise((res,rej)=>{
        const items = [{id:1,name:'Nistha'},{id:2,name:'Shreya'}];
        if(items.length>0){
            res(items);
        }else{
            rej("rejected");
        }
        });

        Promise.all([promise,promise1,promise2]).then((data)=>{
            console.log(data);
        })
        
        /* promise2.then((data)=>{
            console.log(data);
        }).catch((reason)=>{
            console.log(reason);
        }) */