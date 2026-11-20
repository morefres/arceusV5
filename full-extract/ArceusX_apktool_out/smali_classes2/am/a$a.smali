.class public Lam/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lam/a;->b(Lam/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lam/a$b;

.field public final synthetic b:Lam/a;


# direct methods
.method public constructor <init>(Lam/a;Lam/a$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lam/a$a;->b:Lam/a;

    iput-object p2, p0, Lam/a$a;->a:Lam/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lam/a$a;->a:Lam/a$b;

    invoke-interface {v0, p1}, Lam/a$b;->a(Lorg/json/JSONObject;)V

    return-void
.end method
