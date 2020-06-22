import { createConnection, getManager, getConnection } from "typeorm";
import bodyParser from "body-parser";
import "reflect-metadata";
import express, { NextFunction, Request, Response } from "express";
import http from "http";
import { WorkItem } from "./model/WorkItem";

createConnection()

const app = express();
const router = express.Router();

app.get("/", (req, res) => {
    res.json({ promote: "Hello World" });
});


router.get("", async (req, res, next) => {
    const workItemRepository = getManager().getRepository(WorkItem);

    try {
        const workItems = await workItemRepository.find();

        res.json(workItems);
    } catch (error) {
        next(error);
    }
});

router.post("", async (req, res, next) => {
    const workItem = new WorkItem();

    workItem.text = req.body.text;

    const workItemRepository = getManager().getRepository(WorkItem);
    try {
        res.json(await workItemRepository.save(workItem));
    } catch (error) {
        next(error);
    }
});

router.put("/:id", async (req, res, next) => {

    const body = req.body;
    const workItemRepository = getConnection().manager.getRepository(WorkItem);

    try {
        await workItemRepository.update(req.params.id, { isChecked: body.isChecked });
        res.sendStatus(204);
    } catch (error) {
        next(error);
    }
});

router.delete("/:id", async (req, res, next) => {

    const body = req.body;
    const workItemRepository = getConnection().manager.getRepository(WorkItem);

    try {
        await workItemRepository.delete(req.params.id);
        res.sendStatus(204);
    } catch (error) {
        next(error);
    }
});

const server = http.createServer(app);

app.use("/work-items", router);
app.use(bodyParser.json());
app.listen(3001);
