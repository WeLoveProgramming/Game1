Game1
===========
Objects:
 
  Avatar:
  
    HP
    Weapon
    xpos, ypos //determines point of view
    fallingSpeed
  
  Weapon:
  
    damage
    isActive
    
  Obstacles:
  
    xpos, ypos, tickAction()
    
  Enemies extends Obstacles:
  
    @inherited
    xpos, ypos
    @new members
    directionMoving
    @override
    tickAction()
    
Components:

  On every tick:
  
    Background picture, a looping picture that is continous, ypos--
    Obstacles and enemies, ypos--.  
    enemies.move()
    if weapon collides, then enemies.ypos++ and enemies.hp--
    if avatar collides, then backgound.ypos++,avatar.hp--, enemies.ypos++, obstacle.ypos++, avatar.fallingSpeed--
    if weapon.active==true then weapon.continueSwipe(), weapon.active = false
    avatar.fallingSpeed++
  
  Tilt left:
  
    then enemies.xpos--, obstacle.xpos--, background.xpos--
   
  Tilt right:
  
     then enemies.xpos++, obsticle.xpos++, background.xpos++
   
  Tap:
  
     then weapon.active = true, weapon.swipe(int degree)
  
  EventWhenHP==0:
  
     GameOver()
     ScoreOutput()
