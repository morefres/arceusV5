.class public Lvi/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrg/d0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/c;->c(Landroidx/lifecycle/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le4/q;

.field public final synthetic b:Lvi/c;


# direct methods
.method public constructor <init>(Lvi/c;Le4/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvi/c$a;->b:Lvi/c;

    iput-object p2, p0, Lvi/c$a;->a:Le4/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lvi/c$a;->b:Lvi/c;

    iget-object v1, p0, Lvi/c$a;->a:Le4/q;

    invoke-static {v0, v1}, Lvi/c;->a(Lvi/c;Landroid/app/Activity;)V

    return-void
.end method
