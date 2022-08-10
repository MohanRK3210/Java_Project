    const para = document.createElement("a");
    const node = document.createTextNode("Marcel Proust");
    para.appendChild(node);
    
    const image = document.createElement('img');
    image.setAttribute('src','assets/img/romance.jpg');
    
    const linebreak1 = document.createElement('br');
    const linebreak2 = document.createElement('br');
    const linebreak3 = document.createElement('br');
    
    const link = document.createElement("a");
    const change = document.createTextNode("Continue Reading >>");
    link.appendChild(change);
    link.href = "marcel.html";
    
    const element= document.getElementById('javascript');
    element.appendChild(image);
    element.appendChild(linebreak1);
    element.appendChild(para);
    element.appendChild(linebreak2);
    element.appendChild(link);
    element.appendChild(linebreak3);
    //element.remove(javascript);
    

    const para1 = document.createElement("a");
    const node1 = document.createTextNode("Marquez");
    para1.appendChild(node1);
    
    const image1 = document.createElement('img');
    image1.setAttribute('src','assets/img/educatiopn.jpg');
    
    const linebreak4 = document.createElement('br');
    const linebreak5 = document.createElement('br');
    const linebreak6 = document.createElement('br');
    const linebreak7 = document.createElement('br');

    const link1 = document.createElement("a");
    const change1 = document.createTextNode("Continue Reading >>");
    link1.appendChild(change1);
    link1.href = "marquez.html";
    
    const element1= document.getElementById('javascript1');
    element1.appendChild(linebreak4);
    element1.appendChild(image1);
    element1.appendChild(linebreak5);
    element1.appendChild(para1);
    element1.appendChild(linebreak6);
    element1.appendChild(link1);
    element1.appendChild(linebreak7);
    // element1.remove(javascript1);
    

    function myFunction() {
            var input, filter, ul, li, a, i, txtValue;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            ul = document.getElementById("myUL");
            li = ul.getElementsByTagName("li");

            for(i=0;i<li.length;i++)
            {
                a=li[i].getElementsByTagName("a")[0];
                txtValue = a.textContent || a.innerText;
                if(txtValue.toUpperCase().indexOf(filter)>-1)
                {
                    li[i].style.display="";
                }
                else{
                    li[i].style.display="none";
                }
            }
        }