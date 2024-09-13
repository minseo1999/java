let todoList = localStorage.getItem('todoList') ?
                JSON.parse(localStorage.getItem('todoList')) : [];

//JSON.stringfy (객체|배열) -> 객체, 배열을 string 으로 변환
//JSON.parse (변환된 문자열) -> 원래의 객체, 배열로 변경

//localstorage.setItem("키","밸류") -> localstorage영역에서 데이터 저장
//localstorage.getItem("키") ->localstorage영역에 데이터를 키로 불러옴

window.onload = function(){
    drawTodoList();
}

//할 일을 todoList에 넣어주기
function addToDo(){
    //input요소
    const searchInput = document.querySelector("#search-bar input")
    todoList.push({
        title : searchInput.value,
        date : new Date().getTime(),
        isDone : false
    });

    localStorage.setItem('todoList',JSON.stringify(todoList));

    searchInput.value = "";
    console.log(todoList)
    drawTodoList();
}

//ui에 나타내는 부분
function drawTodoList(){
    const removeTodo = function(removeTodo){
        todoList = todoList.filter(function(todo){
            return !(todo.date === removeTodo.date && removeTodo.title === todo.title)
            localStorage.setItem('todoList',JSON.stringify(todoList));
            drawTodoList();
        })
        //t => !(todo.date === removeTodo.date && removeTodo.title === todo.title)   
    }

    const toggleStatus = function(targeTodo){
        todoList = todoList.map(function(t){
            if(t.date === targeTodo.date && t.title === targeTodo.title){
                t.isDone = !t.isDone;
            }
            return t;
        })
        localStorage.setItem('todoList',JSON.stringify(todoList));
        drawTodoList();
    }

    const todoUl = document.querySelector(".todo-list");
    todoUl.innerHTML="";

    for(let todo of todoList){   
        const todoLi = document.createElement('li') // <li></li>
        todoLi.innerHTML = todo.title;
        todoLi.className = todo.isDone ? 'done' : '';
        todoUl.appendChild(todoLi);
        // todoLi.innerText = searchInput.value;// <li>밥먹기</li>

        todoLi.onclick = function(){
            toggleStatus(todo);
        }

        const removeBtn = document.createElement('div');
        removeBtn.className = 'todo-remove-btn';
        removeBtn.innerHTML = '<i class="fa-solid fa-x"></i>';
        todoLi.appendChild(removeBtn);

        removeBtn.onclick = function(){
            removeTodo(todo)
        }
    }

    

    
    
}





























/*
function addToDo(){
    const searchInput = document.querySelector("#search-bar input")

    const todoLi = document.createElement('li') // <li></li>
    todoLi.innerText = searchInput.value;// <li>밥먹기</li>

    const removeBtn = document.createElement('div');
    removeBtn.className = 'todo-remove-btn';
    removeBtn.innerHTML = '<i class="fa-solid fa-x"></i>';
    todoLi.appendChild(removeBtn);

    removeBtn.onclick = function(){
        $(this.parentNode).remove();
    }

    const todoUl = document.querySelector(".todo-list");
    todoUl.appendChild(todoLi);
}*/