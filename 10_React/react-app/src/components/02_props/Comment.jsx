import React from 'react'

const style = {
    wraper : {
        margin: 8, 
        padding: 8, 
        display:'flex', 
        flexDirection:'row',
        border: '1px solid gray',
        borderRadius: 16
    },
    image:{
        width: 50,
        height: 50,
        borderRadius: 25
    },
    contentContainer:{
        marginLeft: 8,
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        fontSize: 16,
        alignItems: "flex-start",
        color : "black"
    },
    nameText:{
        fontWeight: "bold"
    }
}



function Comment(props) {
  return (
    <div style={style.wraper}>
        <div>
            <img src={props}
            alt="프로필 이미지" 
            style={style.image}/>
        </div>
        <div style={style.contentContainer}>
            <span style={style.nameText}>{props.name}</span>
            <span>{props.comment}</span>
        </div>
    </div>
  )
}

export default Comment;