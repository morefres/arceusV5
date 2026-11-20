.class public final synthetic Lth/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lth/j;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lth/j;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/h;->a:Lth/j;

    iput-object p2, p0, Lth/h;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lth/h;->a:Lth/j;

    iget-object v1, p0, Lth/h;->b:Le4/q;

    invoke-static {v0, v1}, Lth/j;->h3(Lth/j;Le4/q;)V

    return-void
.end method
