import * as Orm from "typeorm";

@Orm.Entity()
export class WorkItem {
    @Orm.PrimaryColumn()
    public id: number = 0;

    @Orm.Column({
        length: 100
    })
    public text: string = "";

    @Orm.Column({
        default: false
    })
    public isChecked: boolean = false;

    // @Orm.CreateDateColumn({
    //     type: "timestamp"
    // })
    // public createdAt: Date = new Date();

    // @Orm.UpdateDateColumn({
    //     type: "timestamp"
    // })
    // public updatedAt: Date = new Date();



}