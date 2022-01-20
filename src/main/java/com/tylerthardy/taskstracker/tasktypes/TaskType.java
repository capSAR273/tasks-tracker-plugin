package com.tylerthardy.taskstracker.tasktypes;

import com.tylerthardy.taskstracker.tasktypes.combattask.CombatTask;
import com.tylerthardy.taskstracker.tasktypes.league1.League1Task;
import com.tylerthardy.taskstracker.tasktypes.league2.League2Task;
import com.tylerthardy.taskstracker.tasktypes.league3.League3Task;
import java.lang.reflect.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskType
{

	COMBAT("Combat Tasks", "combat_tasks.min.json", CombatTask.class),
	LEAGUE_1("League I: Twisted", "league1_tasks.min.json", League1Task.class),
	LEAGUE_2("League II: Trailblazer", "league2_tasks.min.json", League2Task.class),
	LEAGUE_3("League III: Shattered Relics", "league3_tasks.min.json", League3Task.class);
	public final String displayString;
	public final String dataFileName;
	public final Type classType;

	@Override
	public String toString()
	{
		return displayString;
	}
}
