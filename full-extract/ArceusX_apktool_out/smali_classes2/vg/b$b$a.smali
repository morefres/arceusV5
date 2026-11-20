.class public Lvg/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg/b$b;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvg/b$b;


# direct methods
.method public constructor <init>(Lvg/b$b;)V
    .locals 0

    iput-object p1, p0, Lvg/b$b$a;->a:Lvg/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lvg/b$b$a;->a:Lvg/b$b;

    iget-object v0, v0, Lvg/b$b;->a:Lvg/b;

    invoke-static {v0}, Lvg/b;->a(Lvg/b;)Lvg/b$d;

    move-result-object v0

    invoke-interface {v0}, Lvg/b$d;->e()V

    return-void
.end method
