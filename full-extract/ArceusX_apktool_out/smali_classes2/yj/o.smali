.class public final synthetic Lyj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lyj/x;


# direct methods
.method public synthetic constructor <init>(Lyj/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj/o;->a:Lyj/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lyj/o;->a:Lyj/x;

    invoke-static {v0}, Lyj/x;->c(Lyj/x;)V

    return-void
.end method
